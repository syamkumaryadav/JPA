package com.syam.generators;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;



public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		String prefix="SKY";
		String suffix="";
		try {
			 JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
			Connection obtainConnection = jdbcConnectionAccess.obtainConnection();
			String sql="select order_id_seq.nextval from dual";
			Statement statement = obtainConnection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next()) {
				int seqval=rs.getInt(1);
				suffix=String.valueOf(seqval);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prefix+suffix;
	}

}
