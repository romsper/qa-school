package junit.helper;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

public class Wrapper {

    public By byDataListId(String listId) {
        return Selectors.by("data-list-id", listId);
    }
}
