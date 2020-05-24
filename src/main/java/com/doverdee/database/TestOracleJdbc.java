package com.doverdee.database;

import oracle.jdbc.OracleTypes;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author lijia
 * @Title: TestOracleJdbc
 * @ProjectName JavaBase
 * @Description: TODO
 * @Date 2019-07-11 06:07
 */
public class TestOracleJdbc {
  // jdbc-odbc桥连接方式, Oracle 服务器上配置 ODBC 数据源 testA , 并且只能在本地进行连接使用（因无法指明IP地址），已废弃
  String driver = "sun.jdbc.odbc.JdbcOdbc.Driver";
  String url = "jdbc:odbc:testA";
  // jdbc 连接方式， 可以本地也可以远程连接数据库，不通过 ODBC 数据源方式，二直接连接数据库，被使用
  String driver2 = "oracle.jdbc.driver.OracleDriver";
  String url2 = "jdbc:oracle:thin:@WIN-8QQTSQJF2CJ:1521:orcl";

  Connection conn = null;
  PreparedStatement pstmt = null;
  CallableStatement cstmt = null;
  ResultSet rs = null;

  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  public static void main(String[] args) {
    TestOracleJdbc toj = new TestOracleJdbc();
    toj.callMethod(-4);
  }

  public void callMethod(int index) {
    switch (index) {
      case 106:
        // 可进一步扩展带条件过滤的分页查询
      case 105:
        this.testListPageProcedureInPkgWithRowOut(2, 3);
        break;
      case 104:
        this.testListAllProcedureInPkgWithRowOut();
        break;
      case 103:
        this.testListAllProcedureWithRowOut();
        break;
      case 102:
        this.testGetProcedureWithOutParameter(1);
        break;
      case 101:
        this.testInsertProcedureWithNoOut(5, "Cvai", 0);
        break;
      case 5:
        this.testTransaction(300);
        break;
      case 4:
        this.testTableDelete(1);
        break;
      case 3:
        this.testTableSelect();
        break;
      case 2:
        this.testTableInsert();
        break;
      case 1:
        this.testTableCreate();
        break;
      case -1:
        this.testTableAlter();
        break;
      case -2:
        this.testViewCreate();
        break;
      case -3:
        this.testProcedureCreate();
        break;
      case -4:
        this.testFunctionCreate();
        break;
      case -5:
        this.testPackageCreate();
        break;
      default:
        // 结论1：过程、函数、包的定义语句必须带上分号语句结束符，但是其他对象的创建或 DML 语句的执行则不能带分号；
        // 结论2：方法executeQuery被用来执行 SELECT 语句；方法executeUpdate用于执行 INSERT、UPDATE 或 DELETE 语句以及 SQL DDL（数据定义语言）语句。
        //        对于 INSERT、UPDATE 或 DELETE 返回值是一个整数，指示受影响的行数。对于 DDL 等不操作行的语句，executeUpdate 的返回值总为零。
        System.out.println("未定义对应方法");
    }
    System.out.println("执行完成");
  }

  public void testListPageProcedureInPkgWithRowOut(int currentPage, int pageSize) {
    try {
      conn = this.getConnection();
      cstmt = conn.prepareCall("{ call pkgForJavaWithPageProc.procListPageStu(?,?,?) }");
      cstmt.setInt(1, currentPage);
      cstmt.setInt(2, pageSize);
      cstmt.registerOutParameter(3, OracleTypes.CURSOR);
      cstmt.execute();
      rs = (ResultSet) cstmt.getObject(3);
      this.output(rs);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource();
    }
  }

  public void testListAllProcedureInPkgWithRowOut() {
    try {
      conn = this.getConnection();
      cstmt = conn.prepareCall("{ call pkgForJavaWithProc.procListAllStu(?) }");
      cstmt.registerOutParameter(1, OracleTypes.CURSOR);
      cstmt.execute();
      rs = (ResultSet) cstmt.getObject(1);
      this.output(rs);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource();
    }
  }

  public void testListAllProcedureWithRowOut() {
    try {
      conn = this.getConnection();
      cstmt = conn.prepareCall("{ call procListAllStu(?) }");
      cstmt.registerOutParameter(1, OracleTypes.CURSOR);
      cstmt.execute();
      rs = (ResultSet) cstmt.getObject(1);
      this.output(rs);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource();
    }
  }

  public void testGetProcedureWithOutParameter(int id) {
    try {
      conn = this.getConnection();
      cstmt = conn.prepareCall("{ call procGetStu(?,?,?,?) }");
      cstmt.setInt(1, id);
      cstmt.registerOutParameter(2, Types.VARCHAR);
      cstmt.registerOutParameter(3, Types.DATE);
      cstmt.registerOutParameter(4, Types.INTEGER);
      cstmt.execute();
      String name = cstmt.getString(2);
      Timestamp birthday = cstmt.getTimestamp(3);
      int sex = cstmt.getInt(4);

      System.out.println("学生姓名：" + name + "，出生日期：" + sdf.format(birthday) + "，性别编码：" + sex);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource();
    }
  }

  public void testInsertProcedureWithNoOut(int id, String name, int sex) {
    try {
      conn = this.getConnection();
      cstmt = conn.prepareCall("{ call procInstStu(?,?,?,?) }");
      cstmt.setInt(1, id);
      cstmt.setString(2, name);
      cstmt.setTimestamp(3, new Timestamp(Calendar.getInstance().getTimeInMillis()));
      cstmt.setInt(4, sex);
      cstmt.execute();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource();
    }
  }

  public void testTransaction(int money) {
    try {
      conn = this.getConnection();
      conn.setAutoCommit(false);  // 开启手动提交事务，默认是自动提交事务

      pstmt = conn.prepareStatement(" select * from yggz where code = ?");
      pstmt.setInt(1, 1);
      rs = pstmt.executeQuery();
      double salaryOne = 0D;
      if (rs.next()) {
        salaryOne = rs.getDouble("salary");
      }

      pstmt = conn.prepareStatement(" select * from yggz where code = ?");
      pstmt.setInt(1, 2);
      rs = pstmt.executeQuery();
      double salaryTwo = 0D;
      if (rs.next()) {
        salaryTwo = rs.getDouble("salary");
      }

      if (salaryOne - money < salaryTwo + money) {
        throw new RuntimeException("转账后，账户1的金额小于账户2，不能转账");
      }

      pstmt = conn.prepareStatement(" update yggz set salary = salary - ? where code = ? ");
      pstmt.setDouble(1, 300);
      pstmt.setInt(2, 1);
      int effectRowsOne = pstmt.executeUpdate();

      pstmt = conn.prepareStatement(" update yggz set salary = salary + ? where code = ? ");
      pstmt.setDouble(1, 300);
      pstmt.setInt(2, 2);
      int effectRowsTwo = pstmt.executeUpdate();

      if (effectRowsOne == 1 && effectRowsTwo == 1) {
        conn.commit(); // 确认成功后，手工提交事务
        System.out.println("转账成功");
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {

      try {
        conn.rollback(); // 遇到任何失败，则回滚事务
      } catch (SQLException e) {
        e.printStackTrace();
      }

      this.closeResource();
    }
  }

  public void testTableDelete(int id) {
    try {
      conn = this.getConnection();
      pstmt = conn.prepareStatement(" delete from student where id=? ");
      pstmt.setInt(1, id);
      int effectRows = pstmt.executeUpdate();
      System.out.println("本次共删除记录数为：" + effectRows);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource();
    }

  }

  public void testTableSelect() {
    try {
      conn = this.getConnection();
      pstmt = conn.prepareStatement(" select * from student ");
      rs = pstmt.executeQuery();
      this.output(rs);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      this.closeResource();
    }

  }

  public void testTableInsert() {
    try {
      conn = this.getConnection();
      //conn.setAutoCommit(false);
      pstmt = conn.prepareStatement(" insert into student values(4, 'Nice', to_date('2008-07-21 12:12:12', 'yyyy-mm-dd hh24:mi:ss'), 1) ");
      int rn = pstmt.executeUpdate();
      //conn.commit();
      //conn.rollback();
      System.out.println("插入了：" + rn + "条记录");
    } catch (SQLIntegrityConstraintViolationException e) {
      //e.printStackTrace();
      System.out.println("记录已存在");
    } catch (Exception e) {
      //e.printStackTrace();
      System.out.println("插入失败");
    } finally {
      this.closeResource();
    }
  }

  public void testTableCreate() {
    try {
      conn = this.getConnection();
      pstmt = conn.prepareStatement(" create table student(id number, name varchar2(20), birthday date, gender number(1)) ");
      int rn = pstmt.executeUpdate();
      // executeUpdate返回值是受影响的行数。如果执行DDL（create 、drop 、alter、truncate table等）时返回值是0
      if (0 == rn) {
        System.out.println("创建了表对象");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("创建表对象失败");
    } finally {
      this.closeResource();
    }
  }

  public void testTableAlter() {
    try {
      conn = this.getConnection();
      pstmt = conn.prepareStatement(" alter table student add constraint pk_stu_id primary key(id) ");
      int rn = pstmt.executeUpdate();
      // executeUpdate返回值是受影响的行数。如果执行DDL（create 、drop 、alter、truncate table等）时返回值是0
      if (0 == rn) {
        System.out.println("修改了表对象");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("修改表对象失败");
    } finally {
      this.closeResource();
    }
  }

  public void testViewCreate() {
    try {
      conn = this.getConnection();
      pstmt = conn.prepareStatement(" create or replace view v_stu as select id, name from student ");
      int rn = pstmt.executeUpdate();
      if (0 == rn) {
        System.out.println("创建了视图对象");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("创建视图对象失败");
    } finally {
      this.closeResource();
    }
  }

  public void testProcedureCreate() {
    try {
      conn = this.getConnection();
      StringBuffer sbProc = new StringBuffer();
      sbProc.append(" create or replace procedure procInstStu(sid number, sname varchar2, sbthd date, sex number) ")
          .append(" as ")
          .append(" begin ")
          .append("   insert into student(id, name, birthday, gender) values(sid, sname, sbthd, sex); ")
          .append("   commit; ")
          .append(" end; ");
      pstmt = conn.prepareStatement(sbProc.toString());
      int rn = pstmt.executeUpdate();
      if (0 == rn) {
        System.out.println("创建了过程对象");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("创建过程对象失败");
    } finally {
      this.closeResource();
    }
  }

  public void testFunctionCreate() {
    try {
      conn = this.getConnection();
      StringBuffer sbFun = new StringBuffer();
      sbFun.append(" create or replace function sayHello return varchar2 ")
          .append(" as ")
          .append(" begin ")
          .append(" 	return '您好，世界'; ")
          .append(" end; ");
      pstmt = conn.prepareStatement(sbFun.toString());
      int rn = pstmt.executeUpdate();
      if (0 == rn) {
        System.out.println("创建了函数对象");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("创建函数对象失败");
    } finally {
      this.closeResource();
    }
  }

  public void testPackageCreate() {
    try {
      conn = this.getConnection();
      // 开启手动提交
      conn.setAutoCommit(false);
      // 定义包头
      StringBuffer sbp = new StringBuffer();
      sbp.append(" create or replace package pkgForJavaWithPageProc ")
          .append(" as ")
          .append(" 	type myRefCursor is ref cursor; ")
          .append(" 	procedure procListPageStu(cp int, ps int, myRefCs out myRefCursor); ")
          .append(" end pkgForJavaWithPageProc; ");
      pstmt = conn.prepareStatement(sbp.toString());
      int rnPkg = pstmt.executeUpdate();
      if (0 == rnPkg) {
        System.out.println("创建了包头对象");
      }
      // 定义包体
      StringBuffer sbpd = new StringBuffer();
      sbpd.append(" create or replace package body pkgForJavaWithPageProc ")
          .append(" as ")
          .append(" 	procedure procListPageStu(cp int, ps int, myRefCs out myRefCursor)  ")
          .append(" 	as ")
          .append(" 	begin ")
          .append(" 	  -- 正确分页做法是：最内侧选择排序形成新的rownum序列，中间层选择排序后的rownum小于等于pageSize*pageNum的行，最外层选择中间层排序别名rn大于pageSize*(pageNum-1)的所有行（注意给子查询起别名）")
          .append(" 	  open myRefCs for select b.* from (select a.*, rownum rn from (select student.* from student order by birthday desc) a where rownum<=ps*cp) b where b.rn>ps*(cp-1); ")
          .append(" 	end procListPageStu; ")
          .append(" end pkgForJavaWithPageProc; ");
      pstmt = conn.prepareStatement(sbpd.toString());
      int rnPkgBody = pstmt.executeUpdate();
      if (0 == rnPkgBody) {
        System.out.println("创建了包体对象");
      }
      // 包头和包体都执行成功则手动提交
      conn.commit();
    } catch (Exception e) {
      try {
        // 若发生异常则回滚事务
        conn.rollback();
      } catch (SQLException se) {
        se.printStackTrace();
      }
      e.printStackTrace();
      System.out.println("创建包对象失败");
    } finally {
      this.closeResource();
    }
  }

  private void output(ResultSet rs) {
    try {
      while (rs.next()) {
        System.out.println("学生编号：" + rs.getInt(1) + "，姓名：" + rs.getString(2) + "，出生日期：" + sdf.format(rs.getTimestamp(3)) + "，性别编码：" + rs.getInt(4));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private Connection getConnection() {
    try {
      Class.forName(driver2);
      conn = DriverManager.getConnection(url2, "scott", "pw123");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return this.conn;
  }

  private void closeResource() {
    try {
      if (this.rs != null) {
        this.rs.close();
        this.rs = null;
      }
      if (this.pstmt != null) {
        this.pstmt.close();
        this.pstmt = null;
      }
      if (this.cstmt != null) {
        this.cstmt.close();
        this.cstmt = null;
      }
      if (this.conn != null) {
        this.conn.close();
        this.conn = null;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
