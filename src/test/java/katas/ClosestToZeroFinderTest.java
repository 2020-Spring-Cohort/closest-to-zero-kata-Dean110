package katas;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClosestToZeroFinderTest {

  private ClosestToZeroFinder underTest;

  @BeforeEach
  void setUp() {
    underTest = new ClosestToZeroFinder();
  }

  @Test
  public void givenAListWithOneAndTwo_ReturnsOne() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,2));
    int result = underTest.findClosestToZero(testData);
    assertEquals(1, result);
  }
  @Test
  public void givenAListWithTwoAndThree_ReturnsOne() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(2,3));
    int result = underTest.findClosestToZero(testData);
    assertEquals(2, result);
  }
  @Test
  public void givenAListWithTwoAndOne_ReturnsOne() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(2,1));
    int result = underTest.findClosestToZero(testData);
    assertEquals(1, result);
  }
  @Test
  public void givenAListWithTwoAndThreeAndOne_ReturnsOne() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(2,3,1));
    int result = underTest.findClosestToZero(testData);
    assertEquals(1, result);
  }
  @Test
  public void givenAListWithBunchOfPositiveInts_ReturnsOne() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(2,3,5,4,9,6,1,7,12,52,5200));
    int result = underTest.findClosestToZero(testData);
    assertEquals(1, result);
  }
  @Test
  public void givenAListWithNegativeTwoAndThreeAndOne_ReturnsOne() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(-2,3,1));
    int result = underTest.findClosestToZero(testData);
    assertEquals(1, result);
  }
  @Test
  public void givenAListWithNegativeTwoAndThreeAndTwo_ReturnsTwo() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(-2,3,2));
    int result = underTest.findClosestToZero(testData);
    assertEquals(2, result);
  }
  @Test
  public void givenAListWithTwoAndThreeAndNegativeTwo_ReturnsTwo() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(2,3,-2));
    int result = underTest.findClosestToZero(testData);
    assertEquals(2, result);
  }
  @Test
  public void givenAListWithNegativeThreeAndThreeAndNegativeTwo_ReturnsTwo() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(-3,3,-2));
    int result = underTest.findClosestToZero(testData);
    assertEquals(-2, result);
  }
  @Test
  public void givenAListWithABunchOfNegativeIntegers_ReturnsTwo() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(-3,-3,-3, -2, -2,-2,-54,-5,-36,-100005,-3));
    int result = underTest.findClosestToZero(testData);
    assertEquals(-2, result);
  }
  @Test
  public void givenAListWithMaximumIntegers_ReturnsMaximumInteger() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE));
    int result = underTest.findClosestToZero(testData);
    assertEquals(Integer.MAX_VALUE, result);
  }
  @Test
  public void givenAListWithMaximumIntegerAndMinInteger_ReturnsMaximumInteger() throws Exception {
    ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MIN_VALUE));
    int result = underTest.findClosestToZero(testData);
    assertEquals(Integer.MAX_VALUE, result);
  }
  @Test
  public void soutMinAndMaxInteger(){
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }
}
