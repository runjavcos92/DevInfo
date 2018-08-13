package mvc.dtoBeans;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import mvc.controller.BDConect;
import mvc.dao.AREA_INVESTIGACION_DAO;

@Named("area_investigacion")
@RequestScoped
public class AREA_INVESTIGACION_DTO {
	
	private String id_area;
	private String area_de_investigacion;
        private List<String> areas = new ArrayList<>();

        public List<String> getAreas() throws SQLException {
            BDConect con = new BDConect();
            AREA_INVESTIGACION_DAO dao = new AREA_INVESTIGACION_DAO();
            List Result = dao.loadAll(con.conectar());
            areas = Result;
            //for(int i=0;i<=Result.size();i++){System.out.println(""+Result);}
            return areas;
        }

        public void setAreas(List<String> areas) {
        this.areas = areas;
        }
	
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
