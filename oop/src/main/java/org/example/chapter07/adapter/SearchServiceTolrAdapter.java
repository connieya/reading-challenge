package org.example.chapter07.adapter;

public class SearchServiceTolrAdapter implements SearchService {
    private TolrClient tolrClient = new TolrClient();

    public SearchResult search(String keyword) {
        TolrQuery tolrQuery = new TolrQuery(keyword);

        QueryResponse response = tolrClient.query(tolrQuery);

        return  convertToResult(response);

    }

    private SearchResult convertToResult(QueryResponse response) {
        return null;
    }
}
