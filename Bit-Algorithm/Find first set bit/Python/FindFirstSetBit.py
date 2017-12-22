for x in range(int(input())):
    binaryNum = format(int(input()), "b")
    if binaryNum == "0":
        print(0)
    else:
        print(binaryNum[::-1].find('1') + 1)
