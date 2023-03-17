package org.raspberry.yts.services;

import java.util.HashMap;
import java.util.Map;

import org.raspberry.yts.dtos.moviesuggestions.MovieSuggestionsRequestDTO;
import org.raspberry.yts.dtos.moviesuggestions.MovieSuggestionsResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieSuggestionsService extends BaseService {

	@Value("${api.yts.path}")
	private String path;

	public MovieSuggestionsResponseDTO movieSuggestions(MovieSuggestionsRequestDTO requestDTO) {
		Map<String, String> params = new HashMap<>();

		if (requestDTO.getMovieId() != null) {
			params.put("movie_id", Integer.toString(requestDTO.getMovieId()));
		}

		String url = path + "/movie_suggestions.json" + "?" + encodeParams(params);

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, MovieSuggestionsResponseDTO.class);
	}

}
