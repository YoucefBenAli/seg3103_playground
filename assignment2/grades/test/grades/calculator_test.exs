defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  describe "PercentageGrade" do
    test "PercentageGrade1" do
      assert 0 ==
               Calculator.percentage_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0,
                 final: 0
               })
    end

     
    test "PercentageGrade2" do
      assert 50 ==
               Calculator.percentage_grade(%{
                 homework: [0.5],
                 labs: [0.5],
                 midterm: 0.5,
                 final: 0.5
               })
    end
  end

  describe "LetterGrade" do

    test "LetterGrade1" do
      assert "EIN" ==
              Calculator.letter_grade(%{
                homework: [],
                labs: [],
                midterm: 0,
                final: 0
              })
    end


    test "LetterGrade2" do
      assert "A+" ==
              Calculator.letter_grade(%{
                homework: [1],
                labs: [1,1,1],
                midterm: 1,
                final: 1
              })
    end


    test "LetterGrade3" do
      assert "A" ==
              Calculator.letter_grade(%{
                homework: [0.85,0.85,0.85],
                labs: [0.85,0.85,0.85],
                midterm: 0.85,
                final: 0.85
              })
    end



    test "LetterGrade4" do
      assert "A-" ==
               Calculator.letter_grade(%{
                 homework: [0.8,0.8,0.8],
                 labs: [0.8,0.8,0.8],
                 midterm: 0.8,
                 final: 0.8
               })
    end


    test "LetterGrade5" do
      assert "B+" ==
               Calculator.letter_grade(%{
                 homework: [0.75,0.75,0.75],
                 labs: [0.75,0.75,0.75],
                 midterm: 0.75,
                 final: 0.75
               })
    end

    test "LetterGrade6" do
      assert "B" ==
               Calculator.letter_grade(%{
                 homework: [0.7,0.7,0.7],
                 labs: [0.7,0.7,0.7],
                 midterm: 0.7,
                 final: 0.7
               })
    end


    test "LetterGrade7" do
      assert "C+" ==
               Calculator.letter_grade(%{
                 homework: [0.65,0.65,0.65],
                 labs: [0.65,0.65,0.65],
                 midterm: 0.65,
                 final: 0.65
               })
    end


    test "LetterGrade8" do
      assert "C" ==
               Calculator.letter_grade(%{
                 homework:  [0.6,0.6,0.6],
                 labs: [0.6,0.6,0.6],
                 midterm: 0.6,
                 final: 0.6
               })
    end

    test "LetterGrade9" do
      assert "D+" ==
               Calculator.letter_grade(%{
                 homework: [0.55,0.55,0.55],
                 labs: [0.55,0.55,0.55],
                 midterm: 0.55,
                 final: 0.55
               })
    end

    test "LetterGrade10" do
      assert "D" ==
               Calculator.letter_grade(%{
                 homework: [0.50,0.50,0.50],
                 labs: [0.50,0.50,0.50],
                 midterm: 0.5,
                 final: 0.5
               })
    end

    test "LetterGrade11" do
      assert "E" ==
               Calculator.letter_grade(%{
                 homework: [0.45,0.45,0.45],
                 labs: [0.45,0.45,0.45],
                 midterm: 0.45,
                 final: 0.45
               })
    end

    test "LetterGrade12" do
      assert "F" ==
               Calculator.letter_grade(%{
                 homework: [0.4],
                 labs: [0.25,0.25,0.25],
                 midterm: 0.45,
                 final: 0.45
               })
    end

  end


    describe "NumericGrade" do

    test "NumericGrade1" do
      assert 0 ==
              Calculator.numeric_grade(%{
                homework: [],
                labs: [],
                midterm: 0,
                final: 0
              })
    end


    test "NumericGrade2" do
      assert 10 ==
              Calculator.numeric_grade(%{
                homework: [1],
                labs: [1,1,1],
                midterm: 1,
                final: 1
              })
    end


    test "NumericGrade3" do
      assert 9 ==
              Calculator.numeric_grade(%{
                homework: [0.85,0.85,0.85],
                labs: [0.85,0.85,0.85],
                midterm: 0.85,
                final: 0.85
              })
    end



    test "NumericGrade4" do
      assert 8 ==
               Calculator.numeric_grade(%{
                 homework: [0.8,0.8,0.8],
                 labs: [0.8,0.8,0.8],
                 midterm: 0.8,
                 final: 0.8
               })
    end


    test "NumericGrade5" do
      assert 7 ==
               Calculator.numeric_grade(%{
                 homework: [0.75,0.75,0.75],
                 labs: [0.75,0.75,0.75],
                 midterm: 0.75,
                 final: 0.75
               })
    end

    test "NumericGrade6" do
      assert 6 ==
               Calculator.numeric_grade(%{
                 homework: [0.7,0.7,0.7],
                 labs: [0.7,0.7,0.7],
                 midterm: 0.7,
                 final: 0.7
               })
    end


    test "NumericGrade7" do
      assert 5 ==
               Calculator.numeric_grade(%{
                 homework: [0.65,0.65,0.65],
                 labs: [0.65,0.65,0.65],
                 midterm: 0.65,
                 final: 0.65
               })
    end


    test "NumericGrade8" do
      assert 4 ==
               Calculator.numeric_grade(%{
                 homework:  [0.6,0.6,0.6],
                 labs: [0.6,0.6,0.6],
                 midterm: 0.6,
                 final: 0.6
               })
    end

    test "NumericGrade9" do
      assert 3 ==
               Calculator.numeric_grade(%{
                 homework: [0.55,0.55,0.55],
                 labs: [0.55,0.55,0.55],
                 midterm: 0.55,
                 final: 0.55
               })
    end

    test "NumericGrade10" do
      assert 2 ==
               Calculator.numeric_grade(%{
                 homework: [0.50,0.50,0.50],
                 labs: [0.50,0.50,0.50],
                 midterm: 0.5,
                 final: 0.5
               })
    end

    test "NumericGrade11" do
      assert 1 ==
               Calculator.numeric_grade(%{
                 homework: [0.45,0.45,0.45],
                 labs: [0.45,0.45,0.45],
                 midterm: 0.45,
                 final: 0.45
               })
    end

    test "NumericGrade12" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [0.4],
                 labs: [0.25,0.25,0.25],
                 midterm: 0.45,
                 final: 0.45
               })
    end
  end
end
