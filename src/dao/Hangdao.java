package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Hangbean;

public class Hangdao {
	public ArrayList<Hangbean> getHang(){
		ArrayList<Hangbean> ds= new ArrayList<Hangbean>();
		try {
			//b1: Ket noi vao csdl
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			//b2: Lay du lieu ve
			String sql = "select * from Hang";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			//b3: Luu tat ca du lieu vao mang ds
			while(rs.next()) {
				String Mahang = rs.getString(1);
				String tenhang = rs.getString(2);
				String nhacungcap = rs.getString(3);
				long gia = rs.getLong(4);
				long soluong = rs.getLong(5);
				String anh = rs.getString(6);
				ds.add(new Hangbean(Mahang, tenhang, nhacungcap, gia, soluong, anh));
			}
			//b4: Dong ket noi
			rs.close();
			kn.cn.close();
			return ds;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
