package com.example.travelre.pojo.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SceneVO {
    private Long id;

    private String sceneName;

    private String sceneAddr;

    private String sceneIntro;

    private double sceneScore;

    private String sceneUrl1;

}
