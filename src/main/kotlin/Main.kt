/*2022_KAKAO_TECH_INTERNSHIP
[LV.1] 성격 유형 검사하기*/
class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var scores = HashMap<Char, Int>()

        countScore(survey, choices, scores);

        return takeResult(scores)
    }
    private fun countScore(survey: Array<String>, choices: IntArray, score: HashMap<Char, Int>){
        for((idx, str) in survey.withIndex()){
            var nowScore = choices[idx] - 4
            if(nowScore<0){
                score[str[0]] = score.getOrDefault(str[0], 0) + -nowScore
            }else if(nowScore>0){
                score[str[1]] = score.getOrDefault(str[1], 0) + nowScore
            }
        }
    }

    private fun takeResult(score:HashMap<Char, Int>): String{
        var result = "";
        result +=
            if(score.getOrDefault('R', 0)
            >= score.getOrDefault('T', 0) ) "R"
            else "T"

        result +=
            if(score.getOrDefault('C', 0)
                >= score.getOrDefault('F', 0) ) "C"
            else "F"

        result +=
            if(score.getOrDefault('J', 0)
                >= score.getOrDefault('M', 0) ) "J"
            else "M"

        result +=
            if(score.getOrDefault('A', 0)
                >= score.getOrDefault('N', 0) ) "A"
            else "N"

        return result
    }
}