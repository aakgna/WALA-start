
package com.ibm.wala.examples.drivers;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import com.google.gson.Gson;
import com.ibm.wala.core.util.config.AnalysisScopeReader;
import com.ibm.wala.ipa.callgraph.AnalysisScope;
import org.junit.jupiter.api.Test;

class ConvertTest {
    void hashmap() throws IOException {
        AnalysisScope scope = AnalysisScopeReader.instance.readJavaScope("/Users/aakgna/Documents/WALA-Research/WALA-start/src/main/java/com/ibm/wala/examples/drivers/ConstructAllIRs.java", null, AnalysisScopeReader.class.getClassLoader());
        Gson gson = new Gson();
		String json_format = gson.toJson(scope.toString());
		FileWriter writer = new FileWriter("/Users/aakgna/Documents/WALA-Research/WALA-start/output2.json");
		writer.write(json_format);
		writer.close();
    }
}
