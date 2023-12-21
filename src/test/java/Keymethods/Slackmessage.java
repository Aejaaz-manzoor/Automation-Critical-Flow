package Keymethods;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Slackmessage {
	    public static void main(String[] args) {
	       
	        
	    	SimpleDateFormat dateFormat21 = new SimpleDateFormat("dd");
			String Date12 = dateFormat21.format(new Date());
			int myInteger = Integer.parseInt(Date12);
int tmrowdate = myInteger+1;
	
			System.out.println(tmrowdate);
			
	    }}