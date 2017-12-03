package org.weekendcooks.recipes.documents;

import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
public class Recipe {

    @Id
    private String id;

    private String title;

    private String category;

    private String description;

    private List<String> ingredients;

    private List<String> method;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Id", id)
                .append("Title", title)
                .append("Category", category)
                .toString();
    }
}
