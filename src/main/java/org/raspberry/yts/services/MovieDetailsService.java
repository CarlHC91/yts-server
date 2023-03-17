package org.raspberry.yts.services;

import java.util.HashMap;
import java.util.Map;

import org.raspberry.yts.dtos.moviedetails.MovieDetailsRequestDTO;
import org.raspberry.yts.dtos.moviedetails.MovieDetailsResponseDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieDetailsService extends BaseService {

	@Value("${api.yts.path}")
	private String path;

	public MovieDetailsResponseDTO movieDetails(MovieDetailsRequestDTO requestDTO) {
		Map<String, String> params = new HashMap<>();

		if (requestDTO.getMovieId() != null) {
			params.put("movie_id", Integer.toString(requestDTO.getMovieId()));
		}

		if (requestDTO.getWithImages() != null) {
			params.put("with_images", Boolean.toString(requestDTO.getWithImages()));
		}

		if (requestDTO.getWithCast() != null) {
			params.put("with_cast", Boolean.toString(requestDTO.getWithCast()));
		}

		String url = path + "/movie_details.json" + "?" + encodeParams(params);

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, MovieDetailsResponseDTO.class);
	}

}
