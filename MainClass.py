class MainClass :
	@staticmethod
	def main(args) :
		_key = 'Python-inputs'
		a = 0.0
		b = 0.0
		c = 0
		t1 = None
		a = 2.3
		b = 5
		a = float(input())
		b = float(input())
		c = int(input())
		print(a)
		print(b)
		if (a>b) :
			print(a)
		else :
			print(b)
		while (a<b) :
			a = float(input())
			print(b)
		c = 1
		if (c == 1) :
			print(b)
		elif(c == 2) : 
			print(c)

if __name__=='__main__':
	MainClass.main([])