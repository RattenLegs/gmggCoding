package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component //스프링에게 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시
@Data //lombok의 setter를 생성하는 기능과 생성자, toString()등을 자동으로 생성하도록 하는 어노테이션
public class Chef {

}
