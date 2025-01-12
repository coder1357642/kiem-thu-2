# kiem-thu-2
BIT220037 - Vũ Quang Dũng

Mô tả bài tập kiểm thử đơn vị với Java:
Các bài kiểm thử cho phương thức isPrime(int number)
Kiểm thử với các giá trị biên:
Kiểm tra với các số nhỏ hơn hoặc bằng 1 (số âm, số 0 và số 1).
Kiểm tra với các số nguyên tố nhỏ như 2 và 3, và một số không phải là số nguyên tố như 4.
Kiểm thử với các giá trị ngẫu nhiên:
Kiểm tra với số nguyên tố (ví dụ: 29) và số không phải là số nguyên tố (ví dụ: 30).
Các bài kiểm thử cho phương thức quickSort(List<Integer> list)
Dữ liệu ngẫu nhiên:
Kiểm tra việc sắp xếp một danh sách các số nguyên chưa được sắp xếp.
Danh sách rỗng:
Kiểm tra xem nếu danh sách đầu vào rỗng thì kết quả trả về cũng phải là danh sách rỗng.
Dữ liệu lớn:
Kiểm tra việc sắp xếp một danh sách lớn (1 triệu phần tử), đảm bảo danh sách được sắp xếp theo thứ tự tăng dần.
Các bài kiểm thử cho phương thức binarySearch(List<Integer> sortedList, int target)
Tìm thấy:
Kiểm tra việc tìm kiếm một phần tử trong danh sách đã được sắp xếp, ví dụ: tìm số 3 trong danh sách [1, 2, 3, 4, 5] và kiểm tra rằng kết quả trả về là chỉ số 2.
Không tìm thấy:
Kiểm tra việc tìm kiếm một phần tử không có trong danh sách, ví dụ: tìm số 6 trong danh sách [1, 2, 3, 4, 5] và kiểm tra rằng kết quả trả về là -1.
Dữ liệu lớn:
Kiểm tra tìm kiếm trong danh sách có 1 triệu phần tử, đảm bảo rằng phần tử tìm được tại chỉ số cuối cùng.
Các bài kiểm thử cho phương thức mostFrequentWord(String input)
Dữ liệu hợp lệ:
Kiểm tra việc xác định từ xuất hiện nhiều nhất trong một chuỗi, ví dụ: chuỗi "apple banana apple orange banana apple" với kết quả trả về là "apple".
Chuỗi rỗng:
Kiểm tra chuỗi rỗng và đảm bảo rằng kết quả trả về là chuỗi rỗng.
Các bài kiểm thử cho phương thức findObjectWithProperty(List<T> objects, String propertyName, Object value)
Thuộc tính hợp lệ:
Kiểm tra tìm kiếm đối tượng trong danh sách theo tên thuộc tính và giá trị tương ứng. Ví dụ: tìm kiếm đối tượng với tên "Alice".
Thuộc tính không hợp lệ:
Kiểm tra trường hợp không tồn tại thuộc tính (ví dụ: tìm thuộc tính "height" không có trong lớp Dummy).
Giá trị null:
Kiểm tra trường hợp giá trị tìm kiếm là null và đảm bảo ngoại lệ NullPointerException được ném ra.
