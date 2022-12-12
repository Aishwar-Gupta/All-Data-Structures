class Node:
    def __init__(self, data, next):
        self.data = data
        self.next = next


class Linkedlist():
    def __init__(self):        # Empty list
        self.head = None

# TRAVERSAL

    def print(self):        # Print the list
        head = self.head
        if head == None:
            print("The linkedlist is empty!")
        while head:
            print(str(head.data) + " ---> ",end='')
            head = head.next
        print()
    

#INSERT

    def add_start(self, data1):        # Add to Start
        new_node = Node(data1, self.head)
        self.head = new_node
    
    def add_end(self, data1):        # Add to the end
        head = self.head
        while head.next:
            head = head.next
        new_node = Node(data1, None)
        head.next = new_node

    def add_index(self, data1, index):        # Add to a index - start at 0
        head = self.head
        if index == 0:
            self.add_start(data1)
        elif index < 0:
            print('Index cannot be negative!')
            return
        else:
            for i in range(index-1):
                head = head.next
                if head == None:
                    print('Index out of range!')
                    return
            new_node = Node(data1, head.next)
            head.next = new_node

























# DELETE

    def delete_start(self):        # Delete first element
        if self.head == None:
            print('Linkedlist is empty!')
        else:
            self.head = self.head.next

    def delete_end(self):        # Delete the last element
        head = self.head
        if head == None:
            print('Empty linkedlist!')
        else:
            while head.next.next != None:
                head = head.next
            head.next = None
    
    def delete_index(self, index):        # Delete the index - start at 0
        head = self.head
        if index == 0:
            self.delete_start()
        else:
            for i in range(index-1):
                head = head.next
                if head == None:
                    print('Index out of range!')
            head.next = head.next.next




















# SEARCH

    def search(self, data1):        # Search for some data - all occurance starts at 1
        head = self.head
        list1 = []
        count = 0
        while head:
            count += 1
            if head.data == data1:
                list1.append(count)
            head = head.next
        if len(list1) == 0:
            print('Item not found!')
        else:
            print(list1)

    def search_and_delete(self, data1):        # Search all occurance of data and delete
        head = self.head
        while head.next != None:
            if head.next.data == data1:
                head.next = head.next.next
            else:
                head = head.next
        if self.head.data == data1:
            self.head = self.head.next
    
    def search_and_add_after(self, data_search, data_add):        # Search for the data and add after the data - first occurance
        head = self.head
        while head:
            if head.data == data_search:
                new_node = Node(data_add, head.next)
                head.next = new_node
            else:
                head = head.next










# TESTING:
a = Linkedlist()
# a.print()
a.add_start(2)
# a.print()
a.add_start(1)
# a.print()
a.add_end(10)
a.add_end(4)
a.add_end(5)
a.add_end(6)
a.add_end(5)
# a.print()

# a.add_index(0,0)
# a.print()
a.add_index(3,2)
# a.print()


# a.delete_start()
# a.delete_end()
# a.print()
# a.delete_end()
# a.print()
# a.delete_start()
# a.print()
# a.delete_end()
# a.print()
# a.delete_index(4)
# a.print()
# a.delete_index(1)
# a.print()
# a.delete_index(20)
# a.print()
# a.delete_index(5)
# a.print()
# a.print()
a.search_and_delete(10)
# a.print()
a.search_and_delete(5)
# a.print()
a.add_index(5,4)
# a.print()
a.add_end(7)
a.add_end(8)
a.add_end(9)
a.add_end(10)
a.add_end(15)
# a.print()
a.add_start(7)
a.add_index(7, 6)
a.add_index(7, 8)
a.add_index(7, 7)
a.add_index(7, 9)
a.print()
a.search_and_delete(7)
a.add_index(7,6)
a.search_and_delete(15)
a.print()
# a.search_and_add_after(5,15)
a.print()
a.delete_index(9)
a.print()


























































































# class Node:
#     def __init__(self, data, next=None):
#         self.data = data
#         self.next = next


# class Linkedlist:
#     def __init__(self):                               # Empty Linkedlist
#         self.head = None
    

#     def print(self):                                  # Print the list from start
#         head = self.head
#         if head == None:
#             print("Empty Linkedlist!")
#         while head:
#             print(str(head.data) + " ---> ", end = '')
#             head = head.next
#         print()
    

#     def add_beginning(self, data1):                    # Add in the start
#         head = self.head
#         new_node = Node(data1, head)
#         self.head = new_node


#     def add_end(self, data1):                          # Add in the end
#         head = self.head
#         while head.next != None:
#             head = head.next
#         new_node = Node(data1, None)
#         head.next = new_node


#     def add_position(self, data1, position):             # Add at a position - starts at 0
#         head = self.head
#         if position < 0:
#             print("Position can't be negative!")
#             return
#         elif position == 0:
#             return self.add_beginning(data1)
#         else:
#             for i in range(position - 1):
#                 if head == None:
#                     print("Index out of range!")
#                     return
#                 head = head.next
#             new_node = Node(data1, head.next)
#             head.next = new_node


#     def delete_start(self):                              # Delete from start
#         self.head = self.head.next

    
#     def delete_end(self):                                # Delete from end
#         head = self.head
#         if head.next == None:
#             self.delete_start()
#         while head.next.next != None:
#             head = head.next
#         head.next = None


#     # def delete_position(self, position):                           # Delete a position - starts at 0
#     #     head = self.head
#     #     if position < 0:
#     #         print("Position cannot be negative!")
#     #     elif position == 0:
#     #         self.delete_start()
#     #     for i in range(position-1):
#     #         if head == None:
#     #             print("Index out of range!")
#     #             return
#     #         head = head.next
#     #     if head.next == None:
#     #         self.delete_end()
#     #     else:
#     #         head.next = head.next.next


#     def search_data(self, data1):                         # Search for all occurance of data and return position start at 0
#         head = self.head
#         index = 0
#         list1 = []
#         while head != None:
#             if head.data == data1:
#                 list1.append(index)
#             head = head.next
#             index += 1
#         if len(list1) > 0:
#             print(str(data1) + " found at " + str(list1) + ' position.')
#         else:
#             print("Not Found!")
    
#     def __str__(self) -> str:
#         return 

#     def search_and_delete(self, data1):                   # delete all occurances
#         head = self.head
#         while head.next != None:
#             if head.next.data == data1:
#                 head.next = head.next.next
#             else:
#                 head = head.next
#         while self.head.data == data1:
#             self.delete_start()






# a = Linkedlist()
# # a.print()
# # a.add_beginning(10)
# # a.add_beginning(20)
# # a.print()
# # #a.add_end(5)
# # # a.print()
# # a.add_position(5,0)
# # a.print()
# # a.add_position(5,3)
# # a.print()
# # a.add_position(5,2)
# # a.print()
# # a.add_position(5,1)
# # a.add_position(5,20)
# # a.print()
# # a.delete_start()
# # a.delete_start()
# # a.delete_end()
# # a.delete_end()
# # a.print()
# # a.add_end(1)
# # a.add_end(2)
# # a.print()
# # # a.delete_position(5)
# # a.search_data(1)
# # a.add_position(50,4)
# # a.print()
# # a.search_data(50)
# # a.print()
# a.add_beginning(9)
# a.add_end(10)
# a.add_beginning(8)
# a.add_position(7,0)
# a.add_position(7,0)
# a.add_position(7,0)
# a.add_position(7,0)
# a.add_position(5,0)
# a.add_position(6,1)
# a.add_position(4,0)
# a.add_position(3,0)
# a.add_beginning(1)
# a.add_position(2,1)
# a.add_position(7,0)
# a.add_position(7,7)
# a.add_position(7,8)
# # a.print()
# a.search_and_delete(7)
# # a.print()
# a.add_position(7,7)
# # a.print()
# a.search_and_delete(7)
# # a.print()
# a.add_position(7,6)
# a.print()























































































# class Node:
#     def __init__(self, data, next) -> None:
#         self.data = data
#         self.next = next

# class Linkedlist:
#     def __init__(self) -> None:
#         self.head = None
    
#     def print(self):
#         if self.head == None:
#             print("Empty Linkedlist!")
#         head_pointer = self.head
#         #always leave the head and do not change it or other function will screw up as head will be pointing elsewhere 
#         while head_pointer:
#             print(str(head_pointer.data) + " ----> ", end='')
#             head_pointer = head_pointer.next
#         print()
    
#     def add_beginning(self, add_data):
#         new_node = Node(add_data, self.head)
#         self.head = new_node

#     def add_position(self, position, add_data):
#         if position < 1:
#             print("Position cant be 0 or negative!")
#             return
#         head = self.head
#         for i in range(position-1):
#             head = head.next
#             if head == None:
#                 print("Position outside range!")
#                 return
#         new_node = Node(add_data, head.next)
#         head.next = new_node





# a = Linkedlist()
# # a.print()
# a.add_beginning(8)
# a.add_beginning(17)
# a.add_beginning(26)
# a.add_beginning(35)
# a.print()
# a.add_position(2, 10)
# a.add_position(0, 22)
# a.add_position(10,22)
# a.print()
# a.add_position(3,3)
# a.print()

































# class Node:
#     def __init__(self, data, next) -> None:
#         self.data = data
#         self.next = next

# class linkedlist:
#     def __init__(self):
#         self.head = None
    
#     def add_beginning(self, data1):
#         a = Node(data1, self.head)
#         self.head = a
    
#     def print(self):
#         if self.head == None:
#             print("Empty Linkedlist!")
#         while self.head:
#             print(self.head.data)
#             self.head = self.head.next
    




# c = linkedlist()
# c.add_beginning(3)
# c.add_beginning(50)
# c.add_beginning(20)
# c.print()