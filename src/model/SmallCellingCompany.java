package model;

public class SmallCellingCompany extends Company {

	private Article[] articles;
	
	public SmallCellingCompany(String id, String name, Article[] articles) {
		super(id, name);
		this.setArticles(articles);
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}
}
