package br.com.bth8.alexandrialib.api.mapper;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ObjectMapper {

	private final ModelMapper mapper;
	
	public ObjectMapper() {
		this.mapper = new ModelMapper();
	}
	
	public <Origin, Destination> Destination parseObject(Origin origin, Class<Destination> destination) {
		return this.mapper.map(origin, destination);
	}

	
	public <Origin, Destination> List<Destination> parseListObjects(List<Origin> origin, Class<Destination> destinantion) {
		
		List<Destination> destinationList = new ArrayList<>();
		
		for (Object o: origin) {
			destinationList.add(parseObject(o, destinantion));
		}		
		
		return destinationList;
	}
	
}
