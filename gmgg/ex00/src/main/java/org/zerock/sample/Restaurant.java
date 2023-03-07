package org.zerock.sample;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	@Setter(onMethod_ = @Autowired) //onMethod: 생성자 setChef()에 @Autowired 어노테이션을 추가하도록 함.
	private Chef chef;
}
