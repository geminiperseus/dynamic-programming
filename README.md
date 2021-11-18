# dynamic-programming

Goal:
1. sell all the wines, one bottle per year
2. can only take (sell) wine from the front and back of the shelf not from middle.
3. wine get more valuable as time go by. any wine that sold at year X can be sold at (X * price at year 1)
     @param initialPrices array that reperent initial prices of wines, in the same order as they are placed on the shelf. e.g., [2, 4, 3] means there are 3 bottles of wine, the front one can be sold for $2 in first year.
     @return maximum profit you can get by selling all bottles of wines
     
        yr1 => sell wine at idx 0 (price = 2 * 1 = 2)
        yr2 => sell wine at idx 4 (price = 5 * 2 = 10)  8
        yr3 => sell wine at idx 3 (price = 2 * 3 = 6)
        yr4 => sell wine at idx 1 (price = 4 * 4 = 16)  20
        yr5 => sell wine at idx 2 (price = 6 * 5 = 30)
        result 2 + 10 + 6 + 16 + 30 = 64
