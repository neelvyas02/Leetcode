class Solution:
    def minimumPushes(self, word):
        length = len(word)

        total = 0
        count = 1

        while length > 7:
            total += 8 * count
            count += 1
            length -= 8

        return total + (length * count)