package com.example.demo;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransformationController {

    @GetMapping("/slovo")
    public String tranform() {
        Scanner sc = new Scanner(System.in);
        String slovo = sc.nextLine();
        WordTransformator slovoTransform = new WordTransformator(slovo);
        return slovoTransform.getReversedString();
    }
}