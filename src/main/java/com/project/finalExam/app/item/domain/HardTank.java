package com.project.finalExam.app.item.domain;

import com.project.finalExam.components.PasovyPodvozok;
import com.project.finalExam.components.Veza;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HardTank extends Entity implements Vehicle  {
    private String name;
    private Float price;
    private Nationality nationality;
    private PasovyPodvozok pasovyPodvozok;
    private Veza veza;
}
