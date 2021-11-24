package com.story.citizen.dto;

//빌더 패턴으로 구성한 DTO
public class Hello {
    private final String id;
    private final String name;
    private final String birthDate;
    private final String address;

    public static class Builder {
        //필수 매개변수
        private final String id;
        private final String name;
        private final String birthDate;

        //선택 매개변수 - 기본값으로 초기화
        private String address = "";

        public Builder(String id, String name, String birthDate) {
            this.id = id;
            this.name = name;
            this.birthDate = birthDate;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Hello build() {
            return new Hello(this);
        }
    }

    private Hello(Builder builder) {
        id = builder.id;
        name = builder.name;
        birthDate = builder.birthDate;
        address = builder.address;
    }
}