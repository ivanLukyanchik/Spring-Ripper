package net.idt.learning.quoter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //default is class
public @interface InjectRandomInt {
    int min();
    int max();
}
