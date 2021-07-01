defmodule Grades.Calculator do
  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    :rand.uniform(100)
  end

  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    list = ["A+", "A", "A-", "B+", "B", "C+", "C", "D+", "D", "E", "F"]
    #sample(list)
    Enum.random(list)
  end

  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    list = [10,9,8,7,6,5,4,3,2,1,0]
    Enum.random(list)
  end
end