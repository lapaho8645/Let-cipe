package com.ssafy.letcipe.api.dto.recipeBookmark;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqDeleteRecipeBookmarkDto {
    Long recipeId;
}
