package com.freeit.lesson6.annotations;

/*
Придумать и написать собственную аннотацию @Version,
которая будет хранить информацию о версии класса сервиса (поле обязательное) MyService
и кодовое название версии (поле не обязательное) - (например номер версии = 7.1, а кодовое название версии = Nougat).
 */

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    double numberVersion();
    String codeName();
}
