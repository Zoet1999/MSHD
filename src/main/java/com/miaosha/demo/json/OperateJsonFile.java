package com.miaosha.demo.json;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.miaosha.demo.domain.*;
import com.miaosha.demo.service.DisasterDataCode;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OperateJsonFile {
	private static String mypath=System.getProperty("user.dir")+"/home/jar/resource/input/data/";
    //读文件
    public List<DeathStatistics> read_deathStatisticsList(String fileName) throws Exception{
        List<DeathStatistics> list = null;
        String path = mypath + fileName;
        // String path = "F:/datasource/"+fileName;
        //String path = OperateJsonFile.class.getClassLoader().getResource(fileName).getPath();
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, DeathStatistics.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();

        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	
            String id = list.get(i).getId();
            if(id!=null&&id!="") {
            	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	        }
            else {
            	String loca=list.get(i).getLocation();
            	String locationCode=DisasterDataCode.locationDatatoCode(loca);
            	int max=9999,min=1000;
            	int ran = (int) (Math.random()*(max-min)+min); 
            	String code=locationCode+"111"+String.valueOf(ran);
            	list.get(i).setId(code);
            }
        }
        
        return list;
    }

    public List<Shoushang> read_ShoushangList(String fileName) throws Exception{
        List<Shoushang> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Shoushang.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();

        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
 	            String location= DisasterDataCode.locationCodetoData(id);
 	            if(location!=null)
 	                list.get(i).setLocation(location);
 	            else {
 	                System.out.println("error when set location in " + fileName);
 	            }
 	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=9999,min=1000;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"112"+String.valueOf(ran);
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Shizong> read_ShizongList(String fileName) throws Exception{
        List<Shizong> list = null;
        String path =  mypath + fileName;
        //String path = OperateJsonFile.class.getClassLoader().getResource(fileName).getPath();
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Shizong.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
 	            String location= DisasterDataCode.locationCodetoData(id);
 	            if(location!=null)
 	                list.get(i).setLocation(location);
 	            else {
 	                System.out.println("error when set location in " + fileName);
 	            }
 	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=9999,min=1000;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"113"+String.valueOf(ran);
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<CivilStructure> read_civilStructureList(String fileName) throws Exception{
        List<CivilStructure> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, CivilStructure.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
 	            String location= DisasterDataCode.locationCodetoData(id);
 	            if(location!=null)
 	                list.get(i).setLocation(location);
 	            else {
 	                System.out.println("error when set location in " + fileName);
 	            }
 	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=9999,min=1000;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"221"+String.valueOf(ran);
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Zhuanmu> read_ZhuanmuList(String fileName) throws Exception{
        List<Zhuanmu> list = null;
        String path = mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Zhuanmu.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
 	            String location= DisasterDataCode.locationCodetoData(id);
 	            if(location!=null)
 	                list.get(i).setLocation(location);
 	            else {
 	                System.out.println("error when set location in " + fileName);
 	            }
 	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=9999,min=1000;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"222"+String.valueOf(ran);
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Zhuanhun> read_ZhuanhunList(String fileName) throws Exception{
        List<Zhuanhun> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Zhuanhun.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
 	            String location= DisasterDataCode.locationCodetoData(id);
 	            if(location!=null)
 	                list.get(i).setLocation(location);
 	            else {
 	                System.out.println("error when set location in " + fileName);
 	            }
 	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=9999,min=1000;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"223"+String.valueOf(ran);
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Kuangjia> read_KuangjiaList(String fileName) throws Exception{
        List<Kuangjia> list = null;
        String path =  mypath+ fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Kuangjia.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
 	            String location= DisasterDataCode.locationCodetoData(id);
 	            if(location!=null)
 	                list.get(i).setLocation(location);
 	            else {
 	                System.out.println("error when set location in " + fileName);
 	            }
 	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=9999,min=1000;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"224"+String.valueOf(ran);
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<FangwuQita> read_FangwuQitaList(String fileName) throws Exception{
        List<FangwuQita> list = null;
        String path = mypath+ fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, FangwuQita.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
 	            String location= DisasterDataCode.locationCodetoData(id);
 	            if(location!=null)
 	                list.get(i).setLocation(location);
 	            else {
 	                System.out.println("error when set location in " + fileName);
 	            }
 	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=9999,min=1000;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"225"+String.valueOf(ran);
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Jiaotong> read_JiaotongList(String fileName) throws Exception{
        List<Jiaotong> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Jiaotong.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
 	            String location= DisasterDataCode.locationCodetoData(id);
 	            if(location!=null)
 	                list.get(i).setLocation(location);
 	            else {
 	                System.out.println("error when set location in " + fileName);
 	            }
 	           list.get(i).setGrade(list.get(i).getId().substring(18,19));
 	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=999,min=100;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"331"+String.valueOf(ran)+list.get(i).getGrade();
             	list.get(i).setId(code);
             }
            
        }
        return list;
    }

    public List<Gongshui> read_GongshuiList(String fileName) throws Exception{
        List<Gongshui> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Gongshui.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
       	 String id = list.get(i).getId();
         if(id!=null&&id!="") {
         	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	           list.get(i).setGrade(list.get(i).getId().substring(18,19));
	        }
         else {
         	String loca=list.get(i).getLocation();
         	String locationCode=DisasterDataCode.locationDatatoCode(loca);
         	int max=999,min=100;
         	int ran = (int) (Math.random()*(max-min)+min); 
         	String code=locationCode+"332"+String.valueOf(ran)+list.get(i).getGrade();
         	list.get(i).setId(code);
         }
        
        }
        return list;
    }
    
    public List<Shuyou> read_ShuyouList(String fileName) throws Exception{
        List<Shuyou> list = null;
        String path =  mypath+ fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Shuyou.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
       	 String id = list.get(i).getId();
         if(id!=null&&id!="") {
         	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	           list.get(i).setGrade(list.get(i).getId().substring(18,19));
	        }
         else {
         	String loca=list.get(i).getLocation();
         	String locationCode=DisasterDataCode.locationDatatoCode(loca);
         	int max=999,min=100;
         	int ran = (int) (Math.random()*(max-min)+min); 
         	String code=locationCode+"333"+String.valueOf(ran)+list.get(i).getGrade();
         	list.get(i).setId(code);
         }
        
        }
        return list;
    }

    public List<Ranqi> read_RanqiList(String fileName) throws Exception{
        List<Ranqi> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Ranqi.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
       	 String id = list.get(i).getId();
         if(id!=null&&id!="") {
         	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	           list.get(i).setGrade(list.get(i).getId().substring(18,19));
	        }
         else {
         	String loca=list.get(i).getLocation();
         	String locationCode=DisasterDataCode.locationDatatoCode(loca);
         	int max=999,min=100;
         	int ran = (int) (Math.random()*(max-min)+min); 
         	String code=locationCode+"334"+String.valueOf(ran)+list.get(i).getGrade();
         	list.get(i).setId(code);
         }
        
        }
        return list;
    }

    public List<Dianli> read_DianliList(String fileName) throws Exception{
        List<Dianli> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Dianli.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
       	 String id = list.get(i).getId();
         if(id!=null&&id!="") {
         	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	           list.get(i).setGrade(list.get(i).getId().substring(18,19));
	        }
         else {
         	String loca=list.get(i).getLocation();
         	String locationCode=DisasterDataCode.locationDatatoCode(loca);
         	int max=999,min=100;
         	int ran = (int) (Math.random()*(max-min)+min); 
         	String code=locationCode+"335"+String.valueOf(ran)+list.get(i).getGrade();
         	list.get(i).setId(code);
         }
        
        }
        return list;
    }

    public List<Disaster> read_disasterList(String fileName) throws Exception{
        List<Disaster> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Disaster.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
       	 String id = list.get(i).getId();
         if(id!=null&&id!="") {
         	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	           list.get(i).setGrade(list.get(i).getId().substring(18,19));
	        }
         else {
         	String loca=list.get(i).getLocation();
         	String locationCode=DisasterDataCode.locationDatatoCode(loca);
         	int max=999,min=100;
         	int ran = (int) (Math.random()*(max-min)+min); 
         	String code=locationCode+"336"+String.valueOf(ran)+list.get(i).getGrade();
         	list.get(i).setId(code);
         }
        
        }
        return list;
    }

    public List<Shuili> read_ShuiliList(String fileName) throws Exception{
        List<Shuili> list = null;
        String path =  mypath+ fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Shuili.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
       	 String id = list.get(i).getId();
         if(id!=null&&id!="") {
         	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	           list.get(i).setGrade(list.get(i).getId().substring(18,19));
	        }
         else {
         	String loca=list.get(i).getLocation();
         	String locationCode=DisasterDataCode.locationDatatoCode(loca);
         	int max=999,min=100;
         	int ran = (int) (Math.random()*(max-min)+min); 
         	String code=locationCode+"337"+String.valueOf(ran)+list.get(i).getGrade();
         	list.get(i).setId(code);
         }        
        }
        return list;
    }

    public List<CollapseRecord> read_collapseRecordList(String fileName) throws Exception{
        List<CollapseRecord> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, CollapseRecord.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
       	 String id = list.get(i).getId();
         if(id!=null&&id!="") {
         	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	           list.get(i).setStatus(list.get(i).getId().substring(18,19));
	        }
         else {
         	String loca=list.get(i).getLocation();
         	String locationCode=DisasterDataCode.locationDatatoCode(loca);
         	int max=999,min=100;
         	int ran = (int) (Math.random()*(max-min)+min); 
         	String code=locationCode+"441"+String.valueOf(ran)+list.get(i).getStatus();
         	list.get(i).setId(code);
         }
        
        }
        return list;
    }

    public List<Huapo> read_HuapoList(String fileName) throws Exception{
        List<Huapo> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Huapo.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
          	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
    	            String location= DisasterDataCode.locationCodetoData(id);
    	            if(location!=null)
    	                list.get(i).setLocation(location);
    	            else {
    	                System.out.println("error when set location in " + fileName);
    	            }
    	           list.get(i).setStatus(list.get(i).getId().substring(18,19));
    	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=999,min=100;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"442"+String.valueOf(ran)+list.get(i).getStatus();
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Nishiliu> read_NishiliuList(String fileName) throws Exception{
        List<Nishiliu> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Nishiliu.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
          	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
    	            String location= DisasterDataCode.locationCodetoData(id);
    	            if(location!=null)
    	                list.get(i).setLocation(location);
    	            else {
    	                System.out.println("error when set location in " + fileName);
    	            }
    	           list.get(i).setStatus(list.get(i).getId().substring(18,19));
    	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=999,min=100;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"443"+String.valueOf(ran)+list.get(i).getStatus();
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Yanrongtanta> read_YanrongtantaList(String fileName) throws Exception{
        List<Yanrongtanta> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Yanrongtanta.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
          	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
    	            String location= DisasterDataCode.locationCodetoData(id);
    	            if(location!=null)
    	                list.get(i).setLocation(location);
    	            else {
    	                System.out.println("error when set location in " + fileName);
    	            }
    	           list.get(i).setStatus(list.get(i).getId().substring(18,19));
    	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=999,min=100;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"444"+String.valueOf(ran)+list.get(i).getStatus();
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Diliefeng> read_DiliefengList(String fileName) throws Exception{
        List<Diliefeng> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Diliefeng.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
          	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
    	            String location= DisasterDataCode.locationCodetoData(id);
    	            if(location!=null)
    	                list.get(i).setLocation(location);
    	            else {
    	                System.out.println("error when set location in " + fileName);
    	            }
    	           list.get(i).setStatus(list.get(i).getId().substring(18,19));
    	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=999,min=100;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"445"+String.valueOf(ran)+list.get(i).getStatus();
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<Dimianchenjiang> read_DimianchenjiangList(String fileName) throws Exception{
        List<Dimianchenjiang> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, Dimianchenjiang.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
         	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
    	            String location= DisasterDataCode.locationCodetoData(id);
    	            if(location!=null)
    	                list.get(i).setLocation(location);
    	            else {
    	                System.out.println("error when set location in " + fileName);
    	            }
    	           list.get(i).setStatus(list.get(i).getId().substring(18,19));
    	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=999,min=100;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"446"+String.valueOf(ran)+list.get(i).getStatus();
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<CishengzaihaiQita> read_CishengzaihaiQitaList(String fileName) throws Exception{
        List<CishengzaihaiQita> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, CishengzaihaiQita.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
         	 String id = list.get(i).getId();
             if(id!=null&&id!="") {
             	id=id.substring(0,12);
    	            String location= DisasterDataCode.locationCodetoData(id);
    	            if(location!=null)
    	                list.get(i).setLocation(location);
    	            else {
    	                System.out.println("error when set location in " + fileName);
    	            }
    	           list.get(i).setStatus(list.get(i).getId().substring(18,19));
    	        }
             else {
             	String loca=list.get(i).getLocation();
             	String locationCode=DisasterDataCode.locationDatatoCode(loca);
             	int max=999,min=100;
             	int ran = (int) (Math.random()*(max-min)+min); 
             	String code=locationCode+"447"+String.valueOf(ran)+list.get(i).getStatus();
             	list.get(i).setId(code);
             }
        }
        return list;
    }

    public List<ZhenqingJiben> read_ZhenqingJibenList(String fileName) throws Exception{
        List<ZhenqingJiben> list = null;
        String path = mypath+ fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, ZhenqingJiben.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	String id = list.get(i).getId();
            if(id!=null&&id!="") {
            	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	        }
            else {
            	String loca=list.get(i).getLocation();
            	String locationCode=DisasterDataCode.locationDatatoCode(loca);
            	int max=9999,min=1000;
            	int ran = (int) (Math.random()*(max-min)+min); 
            	String code=locationCode+"551"+String.valueOf(ran);
            	list.get(i).setId(code);
            }
        }
        return list;
    }

    public List<DisasterPrediction> read_disasterPredictionList(String fileName) throws Exception{
        List<DisasterPrediction> list = null;
        String path =  mypath + fileName;
        InputStream inputStream = new FileInputStream(path);
        String text = IOUtils.toString(inputStream,"utf8");
        list = JSONObject.parseArray(text, DisasterPrediction.class);
        inputStream.close();

        //读完清空
        Writer writer = new OutputStreamWriter(new FileOutputStream(path),"UTF-8");
        writer.write("");
        writer.flush();
        writer.close();
        if(list == null){
            return list;
        }
        for(int i=0;i<list.size();i++) {
        	String id = list.get(i).getId();
            if(id!=null&&id!="") {
            	id=id.substring(0,12);
	            String location= DisasterDataCode.locationCodetoData(id);
	            if(location!=null)
	                list.get(i).setLocation(location);
	            else {
	                System.out.println("error when set location in " + fileName);
	            }
	        }
            else {
            	String loca=list.get(i).getLocation();
            	String locationCode=DisasterDataCode.locationDatatoCode(loca);
            	int max=9999,min=1000;
            	int ran = (int) (Math.random()*(max-min)+min); 
            	String code=locationCode+"552"+String.valueOf(ran);
            	list.get(i).setId(code);
            }
        }
        return list;
    }


    //从网页端上传写入（暂时用不到）
    public void write_disaster(List<Disaster> list, String fileName) throws Exception{
        String path = "/home/jar/resource/input/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void write_civilStructure(List<CivilStructure> list, String fileName) throws Exception{
        String path = "/home/jar/resource/input/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void write_collapseRecord(List<CollapseRecord> list, String fileName) throws Exception{
        String path = "/home/jar/resource/input/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void write_deathStatistics(List<DeathStatistics> list, String fileName) throws Exception{
        String path = "/home/jar/resource/input/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void write_disasterPrediction(List<DisasterPrediction> list, String fileName) throws Exception{
        String path = "/home/jar/resource/input/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void write_disasterRequest(List<DisasterRequest> list, String fileName) throws Exception{
        String path = "/home/jar/resource/input/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }


    public void export(String[] id, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(id);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }
    //导出到output文件
    public void export_deathStatistics(List<DeathStatistics> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Shoushang(List<Shoushang> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Shizong(List<Shizong> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_civilStructure(List<CivilStructure> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Zhuanmu(List<Zhuanmu> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Zhuanhun(List<Zhuanhun> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Kuangjia(List<Kuangjia> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_FangwuQita(List<FangwuQita> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Jiaotong(List<Jiaotong> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Gongshui(List<Gongshui> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Shuyou(List<Shuyou> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Ranqi(List<Ranqi> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Dianli(List<Dianli> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_disaster(List<Disaster> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Shuili(List<Shuili> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_collapseRecord(List<CollapseRecord> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }


    public void export_Huapo(List<Huapo> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Nishiliu(List<Nishiliu> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Yanrongtanta(List<Yanrongtanta> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Diliefeng(List<Diliefeng> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_Dimianchenjiang(List<Dimianchenjiang> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_CishengzaihaiQita(List<CishengzaihaiQita> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_ZhenqingJiben(List<ZhenqingJiben> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_disasterPrediction(List<DisasterPrediction> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }

    public void export_disasterRequest(List<DisasterRequest> list, String fileName) throws Exception{
        String path = "/home/jar/resource/output/" + fileName;
        File file = new File(path);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        String jsons = JSON.toJSONString(list);
        Writer writer = new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
        writer.write(jsons);
        writer.flush();
        writer.close();
    }
}
