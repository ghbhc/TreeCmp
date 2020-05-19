package treecmp.spr;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pal.tree.Tree;
import treecmp.common.TreeCmpException;
import treecmp.metric.Metric;
import treecmp.test.util.TreeCreator;

import static org.junit.jupiter.api.Assertions.*;

class UsprHeuristicMPUMetricTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetMetricTwoMarsupialsTreesWithSPR_1_distance() throws TreeCmpException {
        Tree baseTree[] = TreeCreator.getTwoMarsupialsSPR_1_distance_trees();
        Metric smpu = new UsprHeuristicMPUMetric();
        Double distance = smpu.getDistance(baseTree[0], baseTree[1]);
        assertTrue(distance >= 1.0);
    }

    @Test
    void testGetMetricTwoMarsupialsTreesWithSPR_2_distance() throws TreeCmpException {
        Tree baseTree[] = TreeCreator.getTwoMarsupialsSPR_2_distance_trees();
        Metric smpu = new UsprHeuristicMPUMetric();
        Double distance = smpu.getDistance(baseTree[0], baseTree[1]);
        assertTrue(distance >= 2.0);
    }

    @Test
    void testGetMetricTwoMarsupialsTreesWithSPR_3_distance() throws TreeCmpException {
        Tree baseTree[] = TreeCreator.getTwoMarsupialsSPR_3_distance_trees();
        Metric smpu = new UsprHeuristicMPUMetric();
        Double distance = smpu.getDistance(baseTree[0], baseTree[1]);
        assertTrue(distance >= 3.0);
    }

    @Test
    void testGetMetricTwoMarsupialsTreesWithSPR_4_distance() throws TreeCmpException {
        Tree baseTree[] = TreeCreator.getTwoMarsupialsSPR_4_distance_trees();
        Metric smpu = new UsprHeuristicMPUMetric();
        Double distance = smpu.getDistance(baseTree[0], baseTree[1]);
        assertTrue(distance >= 4.0);
    }

    @Test
    void testGetMetricTwoMarsupialsTreesWithSPR_4_distance_withoutLabels() throws TreeCmpException {
        Tree baseTree[] = TreeCreator.getTwoMarsupialsSPR_4_distance_trees_withoutLabels();
        Metric smpu = new UsprHeuristicMPUMetric();
        Double distance = smpu.getDistance(baseTree[0], baseTree[1]);
        assertTrue(distance >= 4.0);
    }

}