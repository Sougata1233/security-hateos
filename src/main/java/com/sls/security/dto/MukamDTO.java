package com.sls.security.dto;


import java.io.Serializable;
import java.util.List;

public class MukamDTO implements Serializable {
	
	
    private static final long serialVersionUID = 1L;

    private Long id;

    private String mukamName;
    
    private String isMapped;
    
    
    
   

	public String getIsMapped() {
		return isMapped;
	}

	public void setIsMapped(String isMapped) {
		this.isMapped = isMapped;
	}


	private List<JuteTypeDTO> itemJuteCode;
    
    

	public List<JuteTypeDTO> getItemJuteCode() {
		return itemJuteCode;
	}

	public void setItemJuteCode(List<JuteTypeDTO> itemJuteCode) {
		this.itemJuteCode = itemJuteCode;
	}

	public MukamDTO() {
	super();
    }
    
    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getmukamName() {
	return mukamName;
    }

    public void setmukamName(String mukamName) {
    	this.mukamName = mukamName;
    }

    
    @Override
    public String toString() {
	return "MukamDTO[id=" + id + ", mukamName=" + mukamName + "]";
    }

    

   

}

