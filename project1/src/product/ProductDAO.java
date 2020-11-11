package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	private static Product getProductFrom(ResultSet resultSet) throws SQLException {
		Product product = new Product();
		product.setId(resultSet.getInt("id"));
		product.setPrice(resultSet.getInt("price"));
		product.setName(resultSet.getString("name"));
		product.setFabric(resultSet.getString("fabric"));

		return product;
	}

	public static List<Product> findAll() throws Exception {
		String sql = "SELECT * " + " FROM product";
		try (Connection connection = DB.getConnection("summerproject");
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()) {
			ArrayList<Product> list = new ArrayList<Product>();
			while (resultSet.next())
				list.add(getProductFrom(resultSet));
			return list;
		}
	}

	public static List<Product> findByFabric(String fabric) throws Exception {
		String sql = "SELECT * " + " FROM product " + "WHERE fabric LIKE ?";
		try (Connection connection = DB.getConnection("summerproject");
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setString(1, fabric + "%");
			try (ResultSet resultSet = statement.executeQuery()) {
				ArrayList<Product> list = new ArrayList<Product>();
				while (resultSet.next())
					list.add(getProductFrom(resultSet));
				return list;
			}
		}
	}

	public static Product findById(int id) throws Exception {
		String sql = "SELECT * " + " FROM product " + " WHERE id = ?";
		try (Connection connection = DB.getConnection("summerproject");
				PreparedStatement statement = connection.prepareStatement(sql)) {
			statement.setInt(1, id);
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next())
					return getProductFrom(resultSet);
				else
					return null;
			}
		}
	}

}
