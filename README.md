# GeminiInterfaces
A repository that contains the interface specifications of the Gemini project.

## Creating an OCS class from the GeminiAPI interface

This section shows a recommended workflow and example skeleton for implementing an OCS (Operational Control System) class that implements the GeminiAPI interface.

Prerequisites
- Java JDK installed.
- A Java IDE (IntelliJ IDEA, Eclipse, VS Code) or a build tool (Maven / Gradle).
- The GeminiAPI interface file (locate GeminiAPI.java in this repository).

Steps

1. Locate the GeminiAPI interface
- Find the interface (for example: src/main/java/.../GeminiAPI.java). Note the package and the method signatures it declares.

2. Create a new class called `OCS` that implements GeminiAPI
- Create your OCS class in an appropriate package within your project/module.
- Import the correct package for GeminiAPI.
- The Gemini interface is created with generics. So, it can accept any subclasses of the abstract classes located in the `model` package. Create all the required classes (SciencePlan, ObservingProgram, ObservingProgramConfigs, AstronomicalData, Astronomer, ScienceObserver) and add them to the implementation of the interface.
- Implement all abstract methods from GeminiAPI (your IDE can auto-generate stubs).

Example skeleton (replace placeholder package/imports/methods with the real ones from your GeminiAPI):

```java
package edu.gemini;

import edu.gemini.model.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class OCS implements GeminiAPI<SciencePlan,
        ObservingProgram,
        ObservingProgramConfigs,
        AstronomicalData,
        Astronomer,
        ScienceObserver> {

    @Override
    public ArrayList<SciencePlan> getAllSciencePlans() {
        return null;
    }

    @Override
    public SciencePlan getSciencePlanByNo(int planNo) {
        return null;
    }

    @Override
    public String createSciencePlan(SciencePlan sciencePlan, Astronomer an) {
        return null;
    }

    // more code to be filled
```
