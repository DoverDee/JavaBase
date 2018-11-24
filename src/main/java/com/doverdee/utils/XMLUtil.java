package com.doverdee.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
  public static void main(String[] args) {
    System.out.println(XMLUtil.getProductType());
  }

  //该方法用于从XML配置文件中提取图表类型，并返回类型名
  public static String getProductType() {
    try {
      //创建文档对象
      DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = dFactory.newDocumentBuilder();
      Document doc;
      doc = builder.parse(new File("resource/config-chart.xml"));

      //获取包含图表类型的文本节点
      NodeList nl = doc.getElementsByTagName("chartType");
      Node classNode = nl.item(0).getFirstChild();
      String productType = classNode.getNodeValue().trim();
      return productType;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public static Object getBean() {
    try {
      //创建DOM文档对象
      DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = dFactory.newDocumentBuilder();
      Document doc;
      doc = builder.parse(new File("resource/config-bean.xml"));

      //获取包含类名的文本节点
      NodeList nl = doc.getElementsByTagName("className");
      Node classNode = nl.item(0).getFirstChild();
      String cName = classNode.getNodeValue();

      //通过类名生成实例对象并将其返回
      Class c = Class.forName(cName);
      Object obj = c.newInstance();
      return obj;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
