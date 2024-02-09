package springmvcsearch.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		
		return "fileform";
	}
	
	@RequestMapping(value = "/uploadimage", method =RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m) {
		System.out.println("file upload handler");
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		
		//get the byte data from file object
		byte[] bytes = file.getBytes();
		
		String path=s.getServletContext().getRealPath("/")
				+ "WEB-INF" + File.separator + "resources" + File.separator 
				+ "image" +File.separator+ file.getOriginalFilename();
		
		try {
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(bytes);
		fos.close();
		System.out.println("File upload Successfully");
		
		m.addAttribute("filename",file.getOriginalFilename());
		m.addAttribute("msg", "File Uploaded Successfully");
		
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("File uploading error....");
			m.addAttribute("msg","File uploading error");
		}
		
		return "filesuccess";
	}
}
