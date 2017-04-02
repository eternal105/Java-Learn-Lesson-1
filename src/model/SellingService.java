package model;

import java.math.BigDecimal;

public class SellingService extends Service implements Sellable {

	private Article article;

	public SellingService(Client client, String type, String description, BigDecimal 
			price, Article article) {
		super(client, type, description, price);
		this.setArticle(article);
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public BigDecimal selling(int amountOfArticles) {
		this.setIsFinished(true);
		this.setIsPaid(true);
		return new BigDecimal(amountOfArticles * getPrice().floatValue());
	}
}
