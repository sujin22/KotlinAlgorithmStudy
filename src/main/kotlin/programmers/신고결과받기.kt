package programmers

/*2022_KAKAO_BLIND_RECRUITMENT
[LV.1] 신고결과받기*/
class Solution_신고결과받기 {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer = IntArray(id_list.size){0}
        var reportMap = HashMap<String, ArrayList<String>>()//reportee, reporter List
        var reportedCntMap = HashMap<String, Int>()//reporter, reportcount


        val reportSet = report.toList().distinct()

        for( i in reportSet){
            val idArr = i.split(" ")

            //reportMap 갱신
            var list  = reportMap.getOrDefault(idArr[1], ArrayList<String>(0))
            list.add(idArr[0])
            reportMap[idArr[1]] = list


            //reportedCntMap 갱신
            if(list.size == k){//size가 k이면 신고한사람들한테 다 메일 보냄
                for( id in list){
                    reportedCntMap[id] = reportedCntMap.getOrDefault(id, 0) + 1
                }
            }else if(list.size > k){ // k보다 크면 지금 신고한애 메일수 +1
                reportedCntMap[idArr[0]] = reportedCntMap.getOrDefault(idArr[0], 0) + 1
            }
        }


        for( (idx, value) in id_list.withIndex()){
            answer[idx] = reportedCntMap.getOrDefault(value, 0)
        }
        return answer
    }
}