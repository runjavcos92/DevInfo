import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mvc.dto.areaInvesDTO;

public class areaInvesDAO{
    private static final String SQL_INSERT
		= "INSERT INTO ARE_INVES("
		+ "AREA"
		+ ")VALUES(?)";
	private static final String SQL_SELECT_WHEN
		= "SELECT * "
		+ " FROM ARE_INVES WHERE "
		+ "ID_AREA=? OR "
		+ "AREA=? OR ";
	private static final String SQL_SELECT
		= "SELECT * "
		+ " FROM AREA WHERE ID_AREA=?";
	private static final String SQL_SELECT_All
		= "SELECT * "
		+ " FROM AREA";
	private static final String SQL_UPDATE
		= "UPDATE AREA SET "
		+ "AREA=?"
		+ " WHERE "
		+ " ID_AREA=?";
	private static final String SQL_DELETE
		= "DELETE FROM AREA WHERE "
		+ "ID_AREA=?";
	
	public void create(areaInvesDTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1, dto.getNombreArea());
			ps.executeUpdate();
		} finally {
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	public areaInvesDTO load(areaInvesDTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(SQL_SELECT);
			ps.setString(1, dto.getNombreArea());
			rs = ps.executeQuery();
			List results = getResults(rs);
			if (results.size() > 0) {
				return (areaInvesDTO) results.get(0);
			} else {
				return null;
			}
		} finally {
			cerrar(rs);
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	public List loadAll(Connection conn) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(SQL_SELECT_All);
			rs = ps.executeQuery();
			List results = getResults(rs);
			if (results.size() > 0) {
				return results;
			} else {
				return null;
			}
		} finally {
			cerrar(rs);
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	public List loadSelect(areaInvesDTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(SQL_SELECT_WHEN);
			ps.setString(1, dto.getId_archivo());
			ps.setString(2, dto.getNombreArea());
			rs = ps.executeQuery();
			List results = getResults(rs);
			if (results.size() > 0) {
				return results;
			} else {
				return null;
			}
		} finally {
			cerrar(rs);
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	/*public List loadArchivoPeriodo(areaInvesDTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(SQL_SELECT_ARCHIVO_PERIODO);
			ps.setString(1, dto.getNombre_archivo());
			ps.setString(2, dto.getPeriodo_id_periodo());
			rs = ps.executeQuery();
			List results = getResults(rs);
			if (results.size() > 0) {
				return results;
			} else {
				return null;
			}
		} finally {
			cerrar(rs);
			cerrar(ps);
			cerrar(conn);
		}
	}*/
	
	public void update(areaInvesDTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(SQL_UPDATE);
			ps.setString(1, dto.getNombre_archivo());
			ps.setString(2, dto.getPeriodo_id_periodo());
			ps.setString(3, dto.getReporte_id_reporte());
			ps.setString(4, dto.getId_archivo());
			ps.executeUpdate();
		} finally {
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	public void delete(ARCHIVO_DTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(SQL_DELETE);
			ps.setString(1, dto.getId_archivo());
			ps.executeUpdate();
		} finally {
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	private List getResults(ResultSet rs) throws SQLException {
		List results = new ArrayList();
		while (rs.next()) {
			ARCHIVO_DTO dto = new ARCHIVO_DTO();
			dto.setId_archivo(rs.getString("ID_ARCHIVO"));
			dto.setNombre_archivo(rs.getString("NOMBRE_ARCHIVO"));
			dto.setPeriodo_id_periodo(rs.getString("PERIODO_ID_PERIODO"));
			dto.setReporte_id_reporte(rs.getString("REPORTE_ID_REPORTE"));
			results.add(dto);
		}
		return results;
	}
	
	private void cerrar(PreparedStatement ps) throws SQLException {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
			}
		}
	}
	
	private void cerrar(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
			}
		}
	}
	
	private void cerrar(Connection cnn) {
		if (cnn != null) {
			try {
				cnn.close();
			} catch (SQLException e) {
			}
		}
	}  
}
