package com.pixivic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Document(collection = "rank")
public class Rank {
    @NotNull
    private Illustration[] illustrations;
    @NotNull
    private String mode;
    @NotNull
    private String date;
}
