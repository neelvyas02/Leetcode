class Solution:
    def minimumPushes(self, word) :
        arr=sorted(word)

        freq=[]
        count=1
        for i in range(1, len(arr)):
            if arr[i]==arr[i-1]:
                count += 1
            else:
                freq.append(count)
                count=1

        freq.append(count)

        freq.sort(reverse=True)

        total=0
        push=1
        i=0

        while i < len(freq):
            for _ in range(8):
                if i == len(freq):
                    break
                total += freq[i] * push
                i += 1
            push += 1

        return total