package org.example;

import com.mathsystem.api.graph.GraphFactory;
import com.mathsystem.api.graph.model.Graph;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;

public class GraphTestTest {

    @Test
    void MyTest1() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/sixVerticesTrueTransitiveClosureCheck/sixVerticesTrueTransitiveClosureCheck.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(true);
    }

    @Test
    void MyTest2() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/eightVerticesFalseTransitiveClosureCheck/eightVerticesFalseTransitiveClosureCheck.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }

    @Test
    void MyTest3() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/fiveVerticesTrueTransitiveClosureCheck/fiveVerticesTrueTransitiveClosureCheck.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(true);
    }

    @Test
    void MyTest4() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/sevenVerticesTransitiveClosureCheck/sevenVerticesTransitiveClosureCheck.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }
    @Test
    void MyTest5() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/sixVerticesFalseTransitiveClosureCheck/sixVerticesFalseTransitiveClosureCheck.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }
    @Test
    void MyTest6() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/fourVerticesTrueTransitiveClosureCheck/fourVerticesTrueTransitiveClosureCheck.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(true);
    }
    @Test
    void MyTest7() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/fourVerticesFalseTransitiveClosureCheck/fourVerticesFalseTransitiveClosureCheck.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }

    @Test
    void MyTest8() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/checkInputFormat/singleComponent/singleComponent.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }
    @Test
    void MyTest9() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/checkInputFormat/tooMuchComponents/tooMuchComponents.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }
    @Test
    void MyTest10() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/differentNumberOfVertices/differentNumberOfVertices.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }
    @Test
    void MyTest11() throws FileNotFoundException {
        Graph testGraph = GraphFactory.loadGraphFromFile(new File("src/test/resources/checkInputFormat/withoutEdges/withoutEdges.txt"));
        TransitiveClosureCheck GraphTest = new TransitiveClosureCheck();
        assertThat(GraphTest.execute(testGraph)).isEqualTo(false);
    }
}
