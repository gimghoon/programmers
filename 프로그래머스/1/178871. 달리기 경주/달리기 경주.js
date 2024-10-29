function solution(players, callings) {
    const rankMap = new Map();
    
    players.forEach((name, index) => {
        rankMap.set(name, index);
    });
    
    for(const calledName of callings) {
        const calledNameOfRank = rankMap.get(calledName); 
        const prevCalledNameOfRank = calledNameOfRank - 1; 
        
        const prevRankName = players[prevCalledNameOfRank]; 
        
        players[prevCalledNameOfRank] = calledName; 
        players[calledNameOfRank] = prevRankName; 
        
        rankMap.set(calledName, prevCalledNameOfRank); 
        rankMap.set(prevRankName, calledNameOfRank);
    }
    return players;
}