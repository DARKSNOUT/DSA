class node:
    def __init__(self,data):
        self.data=data
        self.next=None

class linklist:
    def __init__(self):
        self.head=None

    def append(self,data):
        new_node=node(data)
        #isme hamne head declaration kiya kih agar heald khaali ho tohh
        if not self.head:
            self.head=new_node
            return
        #abb pointer ko direction denge,pehle ekdum last node jaenge
        last=self.head
        while last.next:
            last.next
        #ab last node koh had se jod denge
        last.next=new_node
    def insert_at_begining(self,data):
        new_node=node(data)
        self.new_node=head


