package com.devsmi.InjectionTypes.controller;


import com.devsmi.InjectionTypes.FirstClass;
import com.devsmi.InjectionTypes.SecondClass;
import com.devsmi.InjectionTypes.ThirdClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InjectionController {

    /*
    Injection methods;
    Field
    Setter
    Constructor
    */

    @Autowired // Field injection
    private FirstClass firstClass;

    @GetMapping("/names")
    public String getNameofClasses(){
        return this.firstClass.getName() + "_" + this.secondClass.getName() + "_" + this.thirdClass.getName();
    }

    @Autowired // Setter injection
    private SecondClass secondClass;

    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    @Autowired // constructor injection (is recommended)
    private ThirdClass thirdClass;

    public InjectionController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }
}
