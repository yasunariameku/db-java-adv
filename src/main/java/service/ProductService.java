package service;

import java.sql.Connection;
import java.util.List;

import dao.ProductDao;
import entity.Product;
import util.DbUtil;

public class ProductService {

	
	//引数なしコンストラクタ
	public ProductService() {
	}
	
	//product_name, priceを引数に入れてproductDaoのインスタンスメソッドに
	//入れて判定してもらう。

	public List<Product> findById(String product_name, Integer price) {
        try (Connection conn = DbUtil.getConnection()) {
        	
        	//確認用出力プリント文
            //System.out.println(product_name);
            //System.out.println(price);
            
            Product p = new Product(null, product_name,price);
            
            //System.out.println(p);

        	//ProductDaoのインスタンスを生成
        	ProductDao pd = new ProductDao(conn);
        	//ProductDaoのインスタンスメソッドのfindメソッドを呼び出す
        	List<Product> product = pd.find(p);

            return  product;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
	
}
