package com.doverdee.designpattern.creational.prototype;

public class Client {
  public static void main(String[] args) {
    System.out.println("-------------------------------Test PrototypeManager-------------------------------");
    PrototypeManager pm = PrototypeManager.getInstance();
    System.out.println("===== PrototypeConcreteWithDeepCopy =====");
    PrototypeConcreteWithDeepCopy pcWdc = new PrototypeConcreteWithDeepCopy();
    pcWdc.setStrField("OK");
    pcWdc.setDbField(47.0);
    pcWdc.setObjField(new ObjectFieldSerializable());
    System.out.println("---------------pcWdc");
    System.out.println("pcWdc.strField=" + pcWdc.getStrField());
    System.out.println("pcWdc.dbField=" + pcWdc.getDbField());
    System.out.println("pcWdc.objField=" + pcWdc.getObjField());
    pm.addPrototypeConcrete("pcWdc", pcWdc);
    PrototypeConcreteWithDeepCopy pcWdc_clone = (PrototypeConcreteWithDeepCopy)pm.getPrototypeConcreteClone("pcWdc");
    //pcWdc_clone.setStrField("No");
    System.out.println("---------------pcWdc_clone");
    System.out.println("pcWdc_clone.strField=" + pcWdc_clone.getStrField());
    System.out.println("pcWdc_clone.dbField=" + pcWdc_clone.getDbField());
    System.out.println("pcWdc_clone.objField=" + pcWdc_clone.getObjField());
    System.out.println("---------------pcWdc test equals pcWdc_clone");
    System.out.println("pcWdc=pcWdc_clone:" + (pcWdc == pcWdc_clone));
    System.out.println("pcWdc.strField=pcWdc_clone.strField:" + (pcWdc.getStrField()==pcWdc_clone.getStrField()));
    System.out.println("pcWdc.dbField=pcWdc_clone.dbField:" + (pcWdc.getDbField()==pcWdc_clone.getDbField()));
    System.out.println("pcWdc.objField=pcWdc_clone.objField:" + (pcWdc.getObjField()==pcWdc_clone.getObjField()));

    System.out.println("===== PrototypeConcreteWithShallowCopy =====");
    PrototypeConcreteWithShallowCopy pcWsc = new PrototypeConcreteWithShallowCopy();
    pcWsc.setStrField("OK");
    pcWsc.setDbField(47.0);
    pcWsc.setObjField(new ObjectField());
    System.out.println("---------------pcWsc");
    System.out.println("pcWsc.strField=" + pcWsc.getStrField());
    System.out.println("pcWsc.dbField=" + pcWsc.getDbField());
    System.out.println("pcWsc.objField=" + pcWsc.getObjField());
    pm.addPrototypeConcrete("pcWsc", pcWsc);
    PrototypeConcreteWithShallowCopy pcWsc_clone = (PrototypeConcreteWithShallowCopy)pm.getPrototypeConcreteClone("pcWsc");
    //pcWsc_clone.setStrField("No");
    System.out.println("---------------pcWsc_clone");
    System.out.println("pcWsc_clone.strField=" + pcWsc_clone.getStrField());
    System.out.println("pcWsc_clone.dbField=" + pcWsc_clone.getDbField());
    System.out.println("pcWsc_clone.objField=" + pcWsc_clone.getObjField());
    System.out.println("---------------pcWsc test equals pcWdc_clone");
    System.out.println("pcWsc=pcWsc_clone:" + (pcWsc == pcWsc_clone));
    System.out.println("pcWsc.strField=pcWsc_clone.strField:" + (pcWsc.getStrField()==pcWsc_clone.getStrField()));
    System.out.println("pcWsc.dbField=pcWsc_clone.dbField:" + (pcWsc.getDbField()==pcWsc_clone.getDbField()));
    System.out.println("pcWsc.objField=pcWsc_clone.objField:" + (pcWsc.getObjField()==pcWsc_clone.getObjField()));


    System.out.println("-------------------------------TEST TWO COPY-------------------------------");
    System.out.println("===== ShallowCopy =====");
    System.out.println("---------------sc");
    CopyShallow sc = new CopyShallow();
    sc.setFieldStr("Yes");
    sc.setFieldDb(47);
    ObjectField ofc = new ObjectField();
    sc.setFieldObj(ofc);
    System.out.println("sc.fieldStr=" + sc.getFieldStr());
    System.out.println("sc.fieldDb=" + sc.getFieldDb());
    System.out.println("sc.fieldObj=" + sc.getFieldObj());
    System.out.println("---------------pwsc_copy");
    CopyShallow sc_clone = sc.clone();
    sc_clone.setFieldStr("No");
    System.out.println("sc_clone.fieldStr=" + sc_clone.getFieldStr());
    System.out.println("sc_clone.fieldDb=" + sc_clone.getFieldDb());
    System.out.println("sc_clone.fieldObj=" + sc_clone.getFieldObj());
    System.out.println("---------------sc test equals sc_clone");
    System.out.println("sc=sc_clone:" + (sc == sc_clone));
    System.out.println("sc.fieldStr=sc_clone.fieldStr:" + (sc.getFieldStr()==sc_clone.getFieldStr()));
    System.out.println("sc.fieldDb=sc_clone.fieldDb:" + (sc.getFieldDb()==sc_clone.getFieldDb()));
    System.out.println("sc.fieldObj=sc_clone.fieldObj:" + (sc.getFieldObj()==sc_clone.getFieldObj()));

    System.out.println("");
    System.out.println("===== Test DeepCopy =====");
    System.out.println("---------------dc");
    CopyDeep dc = new CopyDeep();
    dc.setFieldStr("Yes");
    dc.setFieldDb(47);
    ObjectFieldSerializable ofs = new ObjectFieldSerializable();
    dc.setFieldObj(ofs);
    System.out.println("dc.fieldStr=" + dc.getFieldStr());
    System.out.println("dc.fieldDb=" + dc.getFieldDb());
    System.out.println("dc.fieldObj=" + dc.getFieldObj());
    System.out.println("---------------pwdc_copy");
    CopyDeep dc_clone = dc.clone();
    dc_clone.setFieldStr("No");
    System.out.println("dc_clone.fieldStr=" + dc_clone.getFieldStr());
    System.out.println("dc_clone.fieldDb=" + dc_clone.getFieldDb());
    System.out.println("dc_clone.fieldObj=" + dc_clone.getFieldObj());
    System.out.println("---------------dc test equals dc_clone");
    System.out.println("dc=dc_clone:" + (sc == sc_clone));
    System.out.println("dc.fieldStr=dc_clone.fieldStr:" + (dc.getFieldStr()==dc_clone.getFieldStr()));
    System.out.println("dc.fieldDb=dc_clone.fieldDb:" + (dc.getFieldDb()==dc_clone.getFieldDb()));
    System.out.println("dc.fieldObj=dc_clone.fieldObj:" + (dc.getFieldObj()==dc_clone.getFieldObj()));
  }
}
