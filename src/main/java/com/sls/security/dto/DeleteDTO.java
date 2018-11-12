package com.sls.security.dto;

public class DeleteDTO {

   
    private int status;

    private int statusCode;
    
    private String msg;

    
    public DeleteDTO() {
	super();
    }

   
    public int getstatus() {
	return status;
    }

    public void setstatus(int status) {
	this.status = status;
    }

    public int getstatusCode() {
	  return statusCode;
    }

    public void setstatusCode(int statusCode) {
	  this.statusCode = statusCode;
    }
   
    
    public String getmsg() {
  	  return msg;
    }

     public void setmsg(String msg) {
  	  this.msg = msg;
    }
   
    
    @Override
    public String toString() {
	return "DeleteDTO [status=" + status + "]";
    }

  

  

}
