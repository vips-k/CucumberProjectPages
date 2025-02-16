package org.sample.automation.allure;

import io.qameta.allure.listener.TestLifecycleListener;
import io.qameta.allure.model.Label;
import io.qameta.allure.model.TestResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomAllureHierarchyListener implements TestLifecycleListener {

    @Override
    public void beforeTestStart(TestResult result) {
        System.out.println("This is before test starts : "+result);
        // Extract tags and convert them into a custom hierarchy
        List<String> hierarchy = result.getLabels().stream()
                .filter(label -> label.getName().startsWith("tag:"))
                .map(Label::getValue)
                .collect(Collectors.toList());

        hierarchy = List.of("Test1","Test2","Test3");
                System.out.println("Hierarchy Labels: " + String.join(" > ", hierarchy));

        // Add a combined custom hierarchy label
        result.getLabels().add(new Label().setName("customHierarchy").setValue(String.join(" > ", hierarchy)));
    }
}

