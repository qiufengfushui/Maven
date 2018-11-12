package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
public class FileUploadController {

    @RequestMapping(value = "/fileUpload.do",method = RequestMethod.GET)
    public String addFile() {
        return "demo";
    }
    @RequestMapping(value = "/fileUpload.do",method = RequestMethod.POST)
    public String addFile(@RequestParam("name") CommonsMultipartFile file, HttpServletRequest request) {
        long  startTime=System.currentTimeMillis();
        String path = request.getSession().getServletContext().getRealPath("/");
        System.out.println(path);
        String fileName = "/upload/"+new Date().getTime()+"-"+file.getOriginalFilename();
        System.out.println(fileName);
        System.out.println(path+fileName);
        File newFile=new File(path+fileName);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        try {
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long  endTime=System.currentTimeMillis();
        System.out.println("方法二的运行时间："+String.valueOf(endTime-startTime)+"ms");
        return "/success";
    }
    public boolean savaFile(CommonsMultipartFile file,String path){
        // 判断文件是否为空
        if(!file.isEmpty()){
            File filePath = new File(path);
            if (filePath.exists()){
                filePath.mkdirs();
                String fileName = "/upload/" + new Date().getTime()+"-"+file.getOriginalFilename();
                String savePath = path+ fileName;
                try {
                    file.transferTo(new File(savePath));
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @RequestMapping(value = "filesUpload.do",method = RequestMethod.GET)
    public String filesUpload(){
        return "index";
    }

    @RequestMapping(value = "filesUpload.do",method = RequestMethod.POST)
    public String filesUpload(HttpServletRequest request,@RequestParam("files") CommonsMultipartFile[] files){
        String path = request.getSession().getServletContext().getRealPath("/");
        if (files != null && files.length>0){
            for (int i = 0; i < files.length; i++) {
                CommonsMultipartFile file = files[i];
                savaFile(file,path);
            }
        }
        return "/success";
    }
}
