package org.raspberry.yts.services;

import java.util.HashMap;
import java.util.Map;

import org.raspberry.yts.dtos.listmovies.ListMoviesRequestDTO;
import org.raspberry.yts.dtos.listmovies.ListMoviesResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ListMoviesService extends BaseService {

	@Value("${api.yts.path}")
	private String path;

	public ListMoviesResponseDTO listMovies(ListMoviesRequestDTO requestDTO) {
		Map<String, String> params = new HashMap<>();

		if (requestDTO.getLimit() != null) {
			params.put("limit", Integer.toString(requestDTO.getLimit()));
		}

		if (requestDTO.getPage() != null) {
			params.put("page", Integer.toString(requestDTO.getPage()));
		}

		if (requestDTO.getQuality() != null) {
			params.put("quality", requestDTO.getQuality());
		}

		if (requestDTO.getMinimumRating() != null) {
			params.put("minimum_rating", Integer.toString(requestDTO.getMinimumRating()));
		}

		if (requestDTO.getQueryTerm() != null) {
			params.put("query_term", requestDTO.getQueryTerm());
		}

		if (requestDTO.getGenre() != null) {
			params.put("genre", requestDTO.getGenre());
		}

		if (requestDTO.getSortBy() != null) {
			params.put("sort_by", requestDTO.getSortBy());
		}

		if (requestDTO.getOrderBy() != null) {
			params.put("order_by", requestDTO.getOrderBy());
		}

		if (requestDTO.getWithRtRatings() != null) {
			params.put("with_rt_ratings", Boolean.toString(requestDTO.getWithRtRatings()));
		}

		String url = path + "/list_movies.json?" + encodeParams(params);

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, ListMoviesResponseDTO.class);
	}

}
