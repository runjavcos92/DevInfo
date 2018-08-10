package mvc.dtoBeans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AREA_INVESTIGACION_DTO {
	
	private String id_area;
	private String area_de_investigacion;
        private List<String> areas_de_investigacion;
	
	public AREA_INVESTIGACION_DTO() {
	}
	
	public String getId_area() {
		return id_area;
	}
	
	public void setId_area(String id_area) {
		this.id_area = id_area;
	}
	
	public String getArea_de_investigacion() {
		return area_de_investigacion;
	}
	
	public void setArea_de_investigacion(String area_de_investigacion) {
		this.area_de_investigacion = area_de_investigacion;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ID_AREA").append(getId_area()).append("\n");
		sb.append("AREA_DE_INVESTIGACION").append(getArea_de_investigacion()).append("\n");
		return sb.toString();
	}
}
