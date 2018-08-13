
package mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AREA_INVESTIGACION_DAO {
	
	private static final String SQL_INSERT
		= "INSERT INTO AREA_INVESTIGACION("
		+ "AREA_DE_INVESTIGACION"
		+ ")VALUES(?)";
	private static final String SQL_SELECT_WHEN
		= "SELECT * "
		+ " FROM AREA_INVESTIGACION WHERE "
		+ "ID_AREA=? OR "
		+ "AREA_DE_INVESTIGACION=?";
	private static final String SQL_SELECT
		= "SELECT * "
		+ " FROM AREA_INVESTIGACION WHERE ID_AREA=?";
	private static final String SQL_SELECT_All
		= "SELECT * "
		+ " FROM AREA_INVESTIGACION";
	private static final String SQL_UPDATE
		= "UPDATE AREA_INVESTIGACION SET "
		+ "AREA_DE_INVESTIGACION=?"
		+ " WHERE "
		+ " ID_AREA=?";
	private static final String SQL_DELETE
		= "DELETE FROM AREA_INVESTIGACION WHERE "
		+ "ID_AREA=?";
	
	public void create(AREA_INVESTIGACION_DTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(SQL_INSERT);
			ps.setString(1, dto.getArea_de_investigacion());
			ps.executeUpdate();
		} finally {
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	public AREA_INVESTIGACION_DTO load(AREA_INVESTIGACION_DTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(SQL_SELECT);
			ps.setString(1, dto.getId_area());
			rs = ps.executeQuery();
			List results = getResults(rs);
			if (results.size() > 0) {
				return (AREA_INVESTIGACION_DTO) results.get(0);
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
                                System.out.println(" "+results);
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
	
	public List loadSelect(AREA_INVESTIGACION_DTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(SQL_SELECT_WHEN);
			ps.setString(1, dto.getId_area());
			ps.setString(2, dto.getArea_de_investigacion());
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
	
	public void update(AREA_INVESTIGACION_DTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(SQL_UPDATE);
			ps.setString(1, dto.getArea_de_investigacion());
			ps.setString(2, dto.getId_area());
			ps.executeUpdate();
		} finally {
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	public void delete(AREA_INVESTIGACION_DTO dto, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(SQL_DELETE);
			ps.setString(1, dto.getId_area());
			ps.executeUpdate();
		} finally {
			cerrar(ps);
			cerrar(conn);
		}
	}
	
	private List getResults(ResultSet rs) throws SQLException {
		List results = new ArrayList();
		while (rs.next()) {
			AREA_INVESTIGACION_DTO dto = new AREA_INVESTIGACION_DTO();
			dto.setId_area(rs.getString("ID_AREA"));
			dto.setArea_de_investigacion(rs.getString("AREA_DE_INVESTIGACION"));
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
